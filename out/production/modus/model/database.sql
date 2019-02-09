CREATE TABLE `superPerson` (
	`personId` INT NOT NULL AUTO_INCREMENT,
	`title` VARCHAR(8) NOT NULL,
	`firstName` VARCHAR(12) NOT NULL,
	`lastName` VARCHAR(12) NOT NULL,
	`addressLine1` VARCHAR(24) NOT NULL,
	`addressLine2` VARCHAR(24) NOT NULL,
	`town` VARCHAR(24) NOT NULL,
	`county` VARCHAR(24) NOT NULL,
	`postcode` VARCHAR(8) NOT NULL,
	`country` VARCHAR(24) NOT NULL,
	`homeNumber` VARCHAR(14) NOT NULL,
	`mobileNumber` VARCHAR(14) NOT NULL,
	`status` BOOLEAN(1) NOT NULL,
	`dateRegistered` DATE(8) NOT NULL,
	PRIMARY KEY (`personId`)
);

CREATE TABLE `applicantPurchaser` (
	`appPurchaserId` INT NOT NULL AUTO_INCREMENT,
	`appPurchaserId` INT NOT NULL,
	`currency` varchar(1) NOT NULL,
	`priceMin` INT NOT NULL,
	`priceMax` INT NOT NULL,
	`beds` INT(2) NOT NULL,
	`homeStyle` VARCHAR(12) NOT NULL,
	`ownPropertyStatus` VARCHAR(12) NOT NULL,
	`firstTimeBuyer` BOOLEAN(1) NOT NULL,
	`purchaseType` BOOLEAN(1) NOT NULL DEFAULT 'mortgage',
	PRIMARY KEY (`appPurchaserId`)
);

CREATE TABLE `landlord` (
	`landlordId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL AUTO_INCREMENT,
	`rentPropertyId` INT NOT NULL,
	`registeredAddress1` VARCHAR(24) NOT NULL,
	`registeredAddress2` VARCHAR(24) NOT NULL,
	`registeredTown` VARCHAR(24) NOT NULL,
	`registeredCounty` VARCHAR(24) NOT NULL,
	`registeredPostcode` VARCHAR(8) NOT NULL,
	`registeredCountry` VARCHAR(8) NOT NULL,
	`overseas` BINARY(1) NOT NULL,
	PRIMARY KEY (`landlordId`)
);

CREATE TABLE `superProperty` (
	`propertyId` INT NOT NULL AUTO_INCREMENT,
	`addressLine1` VARCHAR(24) NOT NULL,
	`addressLine2` VARCHAR(24) NOT NULL,
	`town` VARCHAR(24) NOT NULL,
	`county` VARCHAR(24) NOT NULL,
	`postcode` VARCHAR(8) NOT NULL,
	`country` VARCHAR(24) NOT NULL,
	`homeStyle` VARCHAR(12) NOT NULL,
	`parking` VARCHAR(24) NOT NULL,
	`beds` INT(2) NOT NULL,
	PRIMARY KEY (`propertyId`)
);

CREATE TABLE `rentProperty` (
	`rentPropertyId` INT NOT NULL AUTO_INCREMENT,
	`propertyId` INT NOT NULL,
	`availableDate` DATE(8) NOT NULL,
	`furnishedUnfurnished` BOOLEAN(1) NOT NULL,
	`reasonToRent` VARCHAR(24) NOT NULL,
	`letBefore` BOOLEAN(1) NOT NULL,
	`currentlyOTM` BOOLEAN(1) NOT NULL,
	`rentLow` INT NOT NULL,
	`rentHigh` INT NOT NULL,
	PRIMARY KEY (`rentPropertyId`)
);

CREATE TABLE `applicantLetting` (
	`appLettingId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL AUTO_INCREMENT,
	`priceMin` INT NOT NULL,
	`priceMax` INT NOT NULL,
	`beds` INT(2) NOT NULL,
	`funished` BOOLEAN(1) NOT NULL,
	`homeStyle` VARCHAR(12) NOT NULL,
	`registeringOffice` VARCHAR(24) NOT NULL,
	`townAreas` VARCHAR(24) NOT NULL,
	`additionalOffice` VARCHAR(24) NOT NULL,
	`pets` BOOLEAN(1) NOT NULL,
	`moveDate` DATE(8) NOT NULL,
	`registeredDate` DATE(8) NOT NULL,
	`moveReason` VARCHAR(255) NOT NULL,
	`adults` INT(2) NOT NULL,
	`children` INT(2) NOT NULL,
	`smokers` BOOLEAN(1) NOT NULL,
	`housingBenefit` BOOLEAN(1) NOT NULL,
	`notes` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`appLettingId`)
);

CREATE TABLE `tenant` (
	`tenantId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL,
	`nextKinName` VARCHAR(24) NOT NULL,
	`nextKinNumber` VARCHAR(14) NOT NULL,
	`nextKinAddress` VARCHAR(24) NOT NULL,
	`rentPeriodStart` DATE NOT NULL,
	`rentPeriodEnd` DATE NOT NULL,
	`depositAmount` DECIMAL NOT NULL,
	`tenatStatus` VARCHAR(24) NOT NULL DEFAULT 'currentTenant',
	PRIMARY KEY (`tenantId`)
);

CREATE TABLE `tenancy` (
	`tenancyId` INT NOT NULL AUTO_INCREMENT,
	`rentPropertyId` INT NOT NULL,
	`landlordId` INT NOT NULL,
	`tenantId` INT NOT NULL,
	`tenancyLength` INT(2) NOT NULL,
	`statutoryPeriodic` BOOLEAN(1) NOT NULL,
	PRIMARY KEY (`tenancyId`)
);

CREATE TABLE `purchaser` (
	`purchaserId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL,
	PRIMARY KEY (`purchaserId`)
);

CREATE TABLE `vendor` (
	`vendorId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL AUTO_INCREMENT,
	`superPersonId` INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`vendorId`)
);

CREATE TABLE `propertyForSale` (
	`propertyForSaleId` INT NOT NULL AUTO_INCREMENT,
	`propertyId` INT NOT NULL AUTO_INCREMENT,
	`askingPrice` INT(9) NOT NULL,
	PRIMARY KEY (`propertyForSaleId`)
);

CREATE TABLE `underOffer` (
	`underOfferId` INT NOT NULL AUTO_INCREMENT,
	`purchaserId` INT NOT NULL,
	`vendorId` INT NOT NULL,
	PRIMARY KEY (`underOfferId`)
);

ALTER TABLE `applicantPurchaser` ADD CONSTRAINT `applicantPurchaser_fk0` FOREIGN KEY (`appPurchaserId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `landlord` ADD CONSTRAINT `landlord_fk0` FOREIGN KEY (`superPersonId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `landlord` ADD CONSTRAINT `landlord_fk1` FOREIGN KEY (`rentPropertyId`) REFERENCES `rentProperty`(`propertyId`);

ALTER TABLE `rentProperty` ADD CONSTRAINT `rentProperty_fk0` FOREIGN KEY (`propertyId`) REFERENCES `superProperty`(`propertyId`);

ALTER TABLE `applicantLetting` ADD CONSTRAINT `applicantLetting_fk0` FOREIGN KEY (`superPersonId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `tenant` ADD CONSTRAINT `tenant_fk0` FOREIGN KEY (`superPersonId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `tenancy` ADD CONSTRAINT `tenancy_fk0` FOREIGN KEY (`rentPropertyId`) REFERENCES `rentProperty`(`rentPropertyId`);

ALTER TABLE `tenancy` ADD CONSTRAINT `tenancy_fk1` FOREIGN KEY (`landlordId`) REFERENCES `landlord`(`landlordId`);

ALTER TABLE `tenancy` ADD CONSTRAINT `tenancy_fk2` FOREIGN KEY (`tenantId`) REFERENCES `tenant`(`tenantId`);

ALTER TABLE `purchaser` ADD CONSTRAINT `purchaser_fk0` FOREIGN KEY (`superPersonId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `vendor` ADD CONSTRAINT `vendor_fk0` FOREIGN KEY (`superPersonId`) REFERENCES `propertyForSale`(`propertyForSaleId`);

ALTER TABLE `vendor` ADD CONSTRAINT `vendor_fk1` FOREIGN KEY (`superPersonId`) REFERENCES `superPerson`(`personId`);

ALTER TABLE `propertyForSale` ADD CONSTRAINT `propertyForSale_fk0` FOREIGN KEY (`propertyId`) REFERENCES `superProperty`(`propertyId`);

ALTER TABLE `underOffer` ADD CONSTRAINT `underOffer_fk0` FOREIGN KEY (`purchaserId`) REFERENCES `purchaser`(`purchaserId`);

ALTER TABLE `underOffer` ADD CONSTRAINT `underOffer_fk1` FOREIGN KEY (`vendorId`) REFERENCES `vendor`(`vendorId`);
