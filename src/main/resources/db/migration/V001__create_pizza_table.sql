create table pokepizzas.pizza (
    id BIGINT AUTO_INCREMENT NOT NULL,
    name varchar(25) NOT NULL,
    description text NOT NULL,
    flavor varchar(20) NOT NULL,
    price decimal NOT NULL,

    primary key (id)
);