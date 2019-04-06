-- Testowi fryzjerzy
INSERT INTO users (login, password, first_name, last_name) VALUES ('jnowak', 'jnowak', 'Jan', 'Nowak');
INSERT INTO users (login, password, first_name, last_name) VALUES ('jkowalki', 'jkowalki', 'Jan', 'Kowalski');
INSERT INTO users (login, password, first_name, last_name) VALUES ('sgomez', 'sgomez', 'Selena', 'Gomez');
INSERT INTO users (login, password, first_name, last_name) VALUES ('admin', 'admin', 'Admin', 'Admin');


-- testowi petenci

INSERT INTO customers (first_name, last_name, telephone_number, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Cameron', 'Diaz', '0700123456789', '2019-01-01', '10:00:00', 'jkowalki', 'Fajna jest', 'Lubi blond');
INSERT INTO customers (first_name, last_name, telephone_number, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Rocky', 'Balboa', '00166651098', '2019-01-01', '10:30:00', 'jkowalki', 'Brak info', 'Zawsze na krótko');
INSERT INTO customers (first_name, last_name, telephone_number, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Jack', 'Sparrow', '751974346', '2019-01-01', '11:00:00', 'jkowalki', 'Ostatnio ukradł terminal do płatności', 'Wezwać policję!');
INSERT INTO customers (first_name, last_name, telephone_number, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Pamela', 'Anderson', '000465468345', '2019-01-02', '12:00:00', 'jkowalki', 'Chciała coś sobie powiększyć', 'Brak');
INSERT INTO customers (first_name, last_name, telephone_number, visit_date, visit_time, assigned_hairdresser, additional_info, comments)
VALUES ('Anna', 'Grodzka', '2657765453543556', '2019-01-02', '13:00:00', 'jkowalki', '...', 'No comments');