# Event-Driven-System
Simple event-driven application

Tato aplikacia obsahuje triedu Publisher, v ktorej je zoznam listenerov, kde vieme pridat aj novy listener (zaregistrovat).
Ked je potrebne vygenerovat udalost, prejde vsetkych zaregistrovanych listenerov a kazdemu posle notifikaciu. 
