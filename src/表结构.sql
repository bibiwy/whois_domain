/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.5.40 : Database - whois_test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`whois_test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `whois_test`;

/*Table structure for table `whois_domain` */

CREATE TABLE `whois_domain` (
  `id` bigint(255) NOT NULL AUTO_INCREMENT,
  `domain` text,
  `registrar` text,
  `reg_email` text,
  `registrar_whois_server` text,
  `name_server` text,
  `reg_date` text,
  `updated_date` text,
  `expir_date` text,
  `domain_status` text,
  `registrar_abuse_contact_email` text,
  `reg_name` text,
  `registrant_organization` text,
  `registrant_street1` text,
  `registrant_street2` text,
  `registrant_street3` text,
  `registrant_street4` text,
  `registrant_city` text,
  `registrant_state_province` text,
  `registrant_postal_code` text,
  `reg_country` text,
  `reg_fax` text,
  `registrant_fax_ext` text,
  `registrar_abuse_contact_phone` text,
  `registrant_phone_ext` text,
  `adm_email` text,
  `adm_name` text,
  `admin_organization` text,
  `administrativeContact_street1` text,
  `administrativeContact_street2` text,
  `administrativeContact_street3` text,
  `administrativeContact_street4` text,
  `admin_city` text,
  `admin_state_province` text,
  `admin_postal_code` text,
  `adm_country` text,
  `adm_fax` text,
  `admin_fax_ext` text,
  `adm_phone` text,
  `admin_phone_ext` text,
  `tech_email` text,
  `tech_name` text,
  `tech_organization` text,
  `technicalContact_street1` text,
  `technicalContact_street2` text,
  `technicalContact_street3` text,
  `technicalContact_street4` text,
  `tech_city` text,
  `tech_state_province` text,
  `tech_postal_code` text,
  `tech_country` text,
  `tech_fax` text,
  `tech_fax_ext` text,
  `tech_phone` text,
  `tech_phone_ext` text,
  `registrar_IANA_id` text,
  PRIMARY KEY (`id`),
  KEY `domain` (`domain`(255))
) ENGINE=InnoDB AUTO_INCREMENT=195561409 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
