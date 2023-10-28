create table test
(
    id integer auto_increment primary key,
    name         character varying(50),
    account_id   character varying(100),
    token        character(36),
    gmt_create   bigint,
    gmt_modified bigint
);
