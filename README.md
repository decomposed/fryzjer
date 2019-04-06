# fryzjer

Tutaj proponuję wrzucić jak najwięcej detali - taki opis/dokumentacja projektu żeby każdy miał wgląd i mógł edytować. 
Wszelkie uwagi co do propozycji zmian tutaj możemy obgadywać na naszym kanale na slacku.

------------ opis funkcjonalności


------------ opis bazy danych

tabela 'users' reprezentująca użytkowników aplikacji - fryzjerów. Proponuję zrobić na początek np 3 pracowników zakładu fryzjerskiego
Kolumny:
- id
- first_name
- last_name
- login
- password
Wszystko not null

tabela 'customers' reprezentująca klientów. Na początek zainicjować, może z 5 klientów
Kolumny:
- id
- first_name
- last_name
- telephone_number
- visit_date_time
- assigned_hairdresser
Dwie ostatnie kolumny inicjowane nullem przy tworzeniu nowego klienta, wypełniane w momencie umówienia wizyty.
Pozostałe kolumny not null.


Relacja między tymi tabelami OneToMany bo jeden fryzjer może mieć umówionych na wizyte wielu klientów. Relacja users -> customers po kluczu obcym np login (bo jest unikalny i jednoznacznie identyfikuje fryzjera).
Zakładamy przy tym że jeden klient może mieć w jednym czasie umówioną jedną wizytę.
