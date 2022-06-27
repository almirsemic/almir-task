DROP TABLE IF EXISTS greeting;
CREATE TABLE greeting (
    id   VARCHAR(255) NOT NULL,
    language VARCHAR(255) NOT NULL,
    translation VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);