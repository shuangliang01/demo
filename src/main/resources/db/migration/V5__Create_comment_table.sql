create table comment
(
    id INT auto_increment primary key,
    PARENT_ID BIGINT NOT NULL,
    TYPE INT NOT NULL,
    COMMENTATOR INT NOT NULL,
    GMT_CREATE BIGINT NOT NULL,
    GMT_MODIFIED BIGINT NOT NULL,
    LIKE_COUNT BIGINT DEFAULT 0
);