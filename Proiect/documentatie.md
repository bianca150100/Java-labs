# Proiect - CABINET MEDICAL


  In acest proiect, mi-am propus sa creez un design pentru un cabinet medical, in care voi tine evidenta asupra pacientilor, programarilor, medicilor, precum si a elementelor cu care este dotat cabinetul(medicamente, ustensile, aparatura). Voi prezenta clasele pe scurt, notiunile importante de Java folosite si actiuniile pe care le fac asupra obiectelor.
  
  1. **Clasa Personal** contine informatii despre un angajat - nume, prenume, an_angajare.
  2. **Clasa Programare** contine informatii despre o programare: zi, luna, an, ora, Pacient, Medic. Fiecarei programari i se asociaza un index, definit ca o variabila statica ce e incrementata in constructor.
    
   Pentru ca doresc ca apoi sa sortez programarile in ordine cronologica, am suprascris metoda compareTo.
    
  3. **Clasa Pacient** contine informatiile despre un client: nume, prenume, varsta, data nasterii, precum si Programarea acestuia (am considerat ca la un moment dat fiecare pacient are o singura programare)
  4. **Clasa Reteta** detine informatiile ce apar pe o reteta: Pacient, diagnostic, perioada_tratament, etc.
  
    
  5. **Clasa Medic** extinde clasa Personal si retine informatiile despre un medic ( salariu, specializare, experienta, etc). Fiecare medic contine un vector cu toate programarile sale, definit ca un tablou unidimensional: Programare[] programari. Metode:
   ⋅⋅* setCapacity : prin care redimensionez capacitatea vectorului
   ..* adauga_programare_medic : adauga la primul index disponibil o programare
   ..* sterge_programare_medic : sterge o programare dupa index (dat ca parametru)
   ..* returneaza_pacient : intoarce un obiect de tip Pacient din lista de programari
   ..* elibereaza_reteta: creeaza o reteta corespunzatoare unui pacient. In cazul in care pacientul necesita concediu medical, este eliberat si acesta.
   ..* verifica_disponibilitate_medic : verifica daca ziua, luna si anul pentru care se solicita o programare este ocupata
   
   6. **Clasa Gestiune_medici** contine un vector cu medicii din cabinet(este initializata in constructor cu 3 medici diferiti).
   
   7. **Clasa Secretariat** extinde clasa Personal, deoarece aceasta e oarecum responsabila de actiunile unui secretar. Totodata, aceasta contine un obiect de tip Gestiune_medici, pentru a fi mai usor in a gestiona activitatea cabientului.
    ..* genereaza_lista_medici : afiseaza la tastatura numele fiecarui medic, pentru a folosi la crearea unui programari (Clientul isi va alege din aceasta lista medicul la care doreste sa fie programat)
    ..* creeaza_programare : functia e responsabila de citirea datelor necesare unei noi programari. Daca medicul la care se doreste sa fie repartizata programarea este disponibil, atunci Programarea este adaugata la lista de prog a medicului, iar pacientului creat i se va atribui programarea. ! Aici sortez programarile medicului, pentru a fi retinute in ordine cronologica.
    ..* anuleaza_programare: se citeste indexul unei programari, medicul la care este realizata si se apeleaza functia din clasa Medic: sterge_programare_medic. In acest caz, programarile nu mai trebuiesc sortate, deoarece vor ramane.
    ..* modifica_programare: se poate modifica o programare doar daca data noua e disponibila. Ulterior, vectorul de programari corespunzatoare medicului e din nou sortat.
    
   8. **Clasa Test_medici** este conceputa pentru a testa serviciile deja create si a adauga altele noi:
   ..* serviciu_adauga_prog 
   ..* serviciu_modifica_prog
   In fiecare este creat un obiect de tip Secretariat care apeleaza functiile existente in clasa sa.
   ..* serviciu_anuleaza_prog
   ..* serviciu_elibereaza_reteta
   ..* afiseaza_programari_medic : afiseaza toate programarile unui medic dat prin index (!acestea sunt sortate)
   ..* afiseaza_programari_zi_cabinet : afiseaza toate programarile dintr-o anumita zi. Se parcurge lista programarilor fiecarui medic si fiecare programare este adaugata intr-un ArrayList. La afisare, doresc ca acestea sa apara in ordine cronologica, deci sortez ArrayList-ul creat.
    
   9. **Clasa Main**: dispune serviciile definite in Test_medici
   
   Pe langa evidenta legata de pacienti/programari, am creat si clase ce ne ajuta la partea de "logistica" 
   
   10. **Clasa Abstracta Dotare** : contine informatii de baza despre un element din incinta cabientului : denumire, numar produse, distribuitor.
   ..* verifica_valabilitate() ; : functie ce va fi redefinita in clasele derivate
   
   11. **Clasa Medicament** extinde Dotare: contine informatii despre un medicament, printre care data expirarii. La override, functia verifica_valabilitate din clasa de baza este definita astfel: foloseste clasa LocalDate pentru a gasi data curenta, iar apoi verifica daca data de expirare este anterioara celei curente;
   
   12. **Clasa Ustensile_aparatura** extinde Dotare: contine informatii despre un aparat din cabinet : daca este de unica_folosinta, numarul maxim de ani de utilizare, anul la care a fost adus. Functia verifica_valabilitate este suprascrisa si verifica daca timpul de utilizare a trecut.
   
   13. **Clasa Logistica** : este menita sa tina evidenta celor de mai sus. Aceasta contine 3 Arraylist-uri: produse_cabinet, medicamente_expirate, aparate_casate.
   ..* am definit functii pentru adaugare/stergere de produs
   ..* caseaza_produs: pentru fiecare produs din Arraylist-ul produse_cabinet se verifica daca e expirat/a trecut termenul de folosire optim. In caz afirmativ, folosind "instance of" este adaugat la lista corespunzatoare: medicament -> medicamente_expirate, ustensila-> aparate_casate. Ulterior, folosesc un iterator pentru a sterge cele casate din produse_cabinet.
   
   14. **Clasa Test_logistica** : contine serviciul adauga_produse, iar in main este apelat atat cel de a adauga produse, cat si cel referitor la casarea acestora.
   
   Am mai creat cateva clase pe parcurs Test_comparare, Test_reteta pentru a ma ajuta sa ma verific la adaugare de noi implementari.
   
   
