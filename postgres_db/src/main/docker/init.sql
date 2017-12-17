CREATE TABLE PASSENGER (
  id BIGINT NOT NULL,
  firstname VARCHAR(25) NOT NULL,
  lastname VARCHAR(25) NOT NULL,
  gender VARCHAR(1) NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE FLIGHT (
  id BIGINT NOT NULL,
  flightno VARCHAR(25) NOT NULL,
  origin VARCHAR(25) NOT NULL,
  destination VARCHAR(25) NOT NULL,
  flightdate DATE NOT NULL,
  flighttime TIME NOT NULL,
  PRIMARY KEY(id)
);

CREATE TABLE BOOKING (
  id BIGINT NOT NULL,
  passengerid BIGINT references PASSENGER(ID),
  flightid BIGINT references FLIGHT(ID),
  bookingdate DATE NOT NULL,
  bookingtime TIME NOT NULL,
  status VARCHAR(4) NOT NULL,
  fare DECIMAL NOT NULL,
  PRIMARY KEY(id)
);
