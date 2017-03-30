# WomenInTech3
Prva zadaća iz kolegija Razvoj mobilnih aplikacija

Kreirana je jednostavna aplikacija koja nudi informacije o tri osobe iz povijesti računarstva.
Za svaku je osobu stavljena slika u obliku ImageButtona, te klikom na sliku ispisuje se citat te osobe u obliku Toast poruke,
citati su spremljeni u XML datoteku, u obliku stringova. Pri korištenju ImageButtona slike se se uvećale, a pomoću ScaleType-a
prilagodile su se button-u. Glavni prozor se vertikalno pomiče, a to je urađeno tako što je RelativeLayout stavljen unutar ScrollView-a.
Zbog veličine teksta svi tekstovi su pomični vertikalno pomoću scrollbars-a. Ovdje je nastao problem jer je jedino glavni prozor bio 
pomičan, a testovi nisu (ScrollView onemogućava). Kako bi ispravili taj problem koristio se NestedScrollView koji omogućava ScrollView unutar
ScrollView-a. Kreirana je klasa InspiringPerson sa svojim atributima i metodama za prisupanje i mjenjanje atributa (set i get).

Poveznice na vanjske resurse:
http://stackoverflow.com/a/10910170
http://stackoverflow.com/a/35219373
http://stackoverflow.com/a/34774098
