-- the first script for migration
create table GuestbookEntry (
    id bigint generated by default as identity, 
    email varchar(255), 
    text varchar(255), 
    primary key (id)
);