CREATE DATABASE IF NOT EXISTS pesticide_db CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE pesticide_db;

CREATE TABLE IF NOT EXISTS pesticide_licenses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    permit_type VARCHAR(50) COMMENT '許可證類型',
    permit_number VARCHAR(50) COMMENT '許可證號碼',
    permit_link TEXT COMMENT '許可證號碼連結',
    common_name VARCHAR(255) COMMENT '普通名稱',
    common_name_link TEXT COMMENT '普通名稱連結',
    brand_name VARCHAR(255) COMMENT '廠牌名稱',
    dosage_form VARCHAR(100) COMMENT '劑型',
    content VARCHAR(100) COMMENT '含量',
    under_permit VARCHAR(100) COMMENT 'Under Permit',
    mixture VARCHAR(100) COMMENT '混合',
    manufacturer VARCHAR(255) COMMENT '廠商名稱',
    manufacturer_link TEXT COMMENT '廠商名稱連結',
    foreign_manufacturer VARCHAR(255) COMMENT '國外原製造廠',
    foreign_manufacturer_link TEXT COMMENT '國外原製造廠連結',
    expiry_date VARCHAR(50) COMMENT '有效日期',
    label_link TEXT COMMENT '標示連結',
    barcode_link TEXT COMMENT '條碼連結',
    usage_link TEXT COMMENT '使用範圍連結',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    INDEX idx_permit_number (permit_number),
    INDEX idx_common_name (common_name),
    INDEX idx_brand_name (brand_name),
    INDEX idx_manufacturer (manufacturer)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='農藥許可證資料';