insert into passenger(id,first_name,last_name,frequent_flyer) values(1000,'Natacha', 'Johanson',1574);
insert into passenger(id,first_name,last_name,frequent_flyer) values(2000,'Niko', 'Thomas',1475);
insert into passenger(id,first_name,last_name,frequent_flyer) values(3000,'Miro', 'Dante',3570);
insert into passenger(id,first_name,last_name,frequent_flyer) values(4000,'Gerdje', 'Hung',5420);


insert into flight(id, flight_number, departure, destination) values (1000, 'FL2.74B','Brussels Airport','JFK');
insert into flight(id, flight_number, departure, destination) values (2000, 'FL3.6FB','Napels','Paris');
insert into flight(id, flight_number, departure, destination) values (3000, 'FL4.74B','Athens','Venice');
insert into flight(id, flight_number, departure, destination) values (4000, 'FL5.74B','Berlin','Florida');


insert into ticket(id, price, passenger_id, flight_id) values ( 0001, 145.50, 1000, 1000);
insert into ticket(id, price, passenger_id, flight_id) values ( 0002, 580.50, 2000, 2000);
insert into ticket(id, price, passenger_id, flight_id) values ( 0003, 320.50, 3000, 3000);

-- twee  -- en spatie is Comment in SQL