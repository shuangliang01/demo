create table TEST
(
    ID INTEGER auto_increment primary key,
    NAME         CHARACTER VARYING(50),
    ACCOUNT_ID   CHARACTER VARYING(100),
    TOKEN        CHARACTER(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT
);
