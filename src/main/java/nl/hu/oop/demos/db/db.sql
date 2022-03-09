drop table if exists autos ;

create table autos (
                       id serial primary key,
                       merk varchar(100) not null,
                       type varchar(100) not null,
                       bouwjaar int
);

insert into autos(merk,type,bouwjaar)values('Mercedes', 'SLK 230', 2008);
insert into autos(merk,type,bouwjaar)values('Suzuki', 'Swift', 2007);
