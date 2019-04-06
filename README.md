# fryzjer

Tutaj proponuję wrzucić jak najwięcej detali - taki opis/dokumentacja projektu żeby każdy miał wgląd i mógł edytować. 
Wszelkie uwagi co do propozycji zmian tutaj możemy obgadywać na naszym kanale na slacku.

Jak ktoś ma propozycje zmian to walcie.

Ogólne założenie na początek, proponuję że jest to fryzjer męski, stała cena usługi 18zł (potrzebne do faktury) i stały czas wykonania usługi - 0.5 godziny (potrzebne żeby wiedzieć czy można umówić klienta na daną godzinę czy nie)

------------ opis funkcjonalności

Po wpisaniu w przeglądarce /fryzjerApp wyświetla się stronka logowania - na środku do wpisania login i password
Po zalogowaniu przekierowuje do adresu /home gdzie na środku jest nazwa firmy ew. jakieś logo.
Z lewej strony informacja: zalogowany jako (login)
W górnej części strony menu gdzie są zakładki 
- strona startowa (/home)
- umówione wizyty (/appointments). Po wejściu wybiera się dzień i wyświetlają się umówione wizyty
- baza klientów (/customers) z tego może taki dropdown gdzie można wybrać 'wyświetl wszystkich klientów', 'znajdź klienta' i 'dodaj nowego klienta'
    po kliknięciu 'znajdź klienta' można wpisać imię i nazwisko i wyrzuca nam dane klienta, wyświetla się czy jest umówiony czy nie, 
    jeśli nie to jest przycisk 'umów na wizytę', po kliknięciu umów można wybrać datę i godzinę. Wyświetli się w jakich godzinach w    danym dniu są wolne terminy.
- wygeneruj fakturę (/invoice). Po kliknięciu poprosi o wpisanie nazwy klienta (imie i nazwisko). Po wybraniu klienta wygeneruje fuckturę

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
- first_name <not null>
- last_name <not null>
- telephone_number <not null>
- visit_date <null>
- visit time <null>
- assigned_hairdresser <null>
- comments <null>

Trzy ostatnie kolumny inicjowane nullem przy tworzeniu nowego klienta, wypełniane w momencie umówienia wizyty.
Pozostałe kolumny not null.


Relacja między tymi tabelami OneToMany bo jeden fryzjer może mieć umówionych na wizyte wielu klientów. Relacja users -> customers po kluczu obcym np login (bo jest unikalny i jednoznacznie identyfikuje fryzjera).
Zakładamy przy tym że jeden klient może mieć w jednym czasie umówioną jedną wizytę.
