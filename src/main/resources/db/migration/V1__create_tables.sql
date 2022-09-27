CREATE TABLE Users
(
    id                          bigserial not null,
    first_name                  varchar(100) not null,
    last_name                   varchar(100) not null,
    username                    varchar(100) not null,
    email                       varchar(100) not null,
    phone_number                varchar(18),
    password                    varchar(255) not null,
    registration_date           date default current_date,
    count_kept_password         int8 not null default 0,
    count_generated_password    int8 not null default 0,
    is_expired                  boolean not null default false,
    is_blocked                  boolean not null default false,
    is_credentials_expired      boolean not null default false,
    is_enabled                  boolean not null default true,
    primary key (id)
);


CREATE TABLE Role
(
    id bigserial not null,
    role_name varchar(100) not null,
    primary key (id)
);


CREATE TABLE User_Role
(
    user_id bigint not null references Users (id),
    role_id bigint not null references Role (id),
    unique (user_id, role_id)
)


CREATE TABLE Resource
(
    id                  bigserial not null,
    resource_name       varchar(255) not null,
    resource_password   varchar(255) not null,
    resource_url        varchar(255),
    picture_url         varchar(255),
    primary key (id)
);


CREATE TABLE Reminder
(
    id bigserial not null,
    user_id     bigint not null references Users (id),
    resource_id bigint not null references Resource (id),
    init_date   date not null,
    remind_date date,
    primary key (id),
    unique (user_id, resource_id)
);
