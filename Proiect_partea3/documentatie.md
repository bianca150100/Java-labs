# Proiect - CABINET MEDICAL


  Partea a III-a:
  
  1. Baze de date:
  
  
  Lucrul cu bazele de date pot fi vizualizate in pachetul "database". M-am folosit de SQLite si am creat o baza de date ce contine urmatoarele tabele: medicament, pacient, programare, personal. Am create operatii de adaugare, modificare, citire din baza de date, afisare, stergerea unei inregistrarii, respectiv stergerea intregului tabel. Testarea acestei implementari poate fi vazuta in clasa "TestareDB".
  
  2. Interfata grafica
  
  
  Dat fiind faptul ca aplicatia mea a avut 2 directii: una in care se retine partea de logistica si cealalta cu privire la programari, mi-am creat 2 interfete corespunzatoare.
  
  Cea corespunzatoare partii de logistica se gaseste in pachetul "interfataLogistica" si are urmatoarele functionalitati: adauga medicament, adauga ustensila, casare, afisare logistica. Pe masura ce sunt adaugate obiecte de tip Medicament, acestea sunt adaugate si in baza de date.
  
  Cea corespunzatoare programarilor se gaseste in pachetul "interfataProg", are 2 ecrane ce pun la dispozitie urmatoarele functionalitati: genereaza lista medici, adauga programare, modifica programare existenta, anuleaza programare. Butonul "verifica disponibilitate medic" va afisa un alt ecran in care se cer informatiile despre data la care se doreste a se verifica disponibilitatea. Cand sunt introduse date, acestea vor fi adaugate si in baza de date, in tabelele corespunzatoare.
  
  Testarea se face in clasa "Main".
  Prin rularea clasei "Main", utilizatorul este intrebat daca doreste sa se ruleze prin intermediul interfetei sau clasic.
  
  3. Serviciul de audit
  
  
  Am adaugat numele thread-ului care apleaza orice functionaliatate: fie cand este apelata in interfata, fie in mod normal.
