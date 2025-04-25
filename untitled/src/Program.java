public class Program {
    public static void main(String[] args) {
        // Utworzenie nowej biblioteki muzycznej
        BibliotekaMuzyczna mojaBiblioteka = new
                BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");
        // Dodawanie utworów do biblioteki
        mojaBiblioteka.dodajUtwor("Led Zeppelin - Stairway to Heaven");
        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters");
        // Wyświetlenie wszystkich utworów
        mojaBiblioteka.wyswietlUtwory();
        // Tworzenie playlist
        mojaBiblioteka.utworzPlayliste("Ulubione");
        mojaBiblioteka.utworzPlayliste("Na imprezę");
        // Dodawanie utworów do playlist
        mojaBiblioteka.dodajUtworDoPlaylisty("Queen - Bohemian Rhapsody", "Ulubione");
                mojaBiblioteka.dodajUtworDoPlaylisty("Pink Floyd - Comfortably Numb", "Ulubione");
                        mojaBiblioteka.dodajUtworDoPlaylisty("AC/DC - Back in Black", "Na imprezę");
        mojaBiblioteka.dodajUtworDoPlaylisty("Metallica - Nothing Else Matters", "Na imprezę");
                // Wyświetlenie wszystkich playlist
                mojaBiblioteka.wyswietlWszystkiePlaylisty();
        // Wyświetlenie zawartości playlisty "Ulubione"
        mojaBiblioteka.wyswietlPlayliste("Ulubione");
        // Wyszukiwanie utworów z frazą "Queen"
        mojaBiblioteka.wyszukajUtwory("Queen");
        // Usunięcie utworu z biblioteki
        mojaBiblioteka.usunUtwor("AC/DC - Back in Black");
        // Sprawdzenie czy utwór został usunięty z playlisty
        mojaBiblioteka.wyswietlPlayliste("Na imprezę");
        System.out.println("Łączna liczba utworów w bibliotece: " +
                mojaBiblioteka.getLiczbaUtworow());
        System.out.println("Łączna liczba playlist: " +
                mojaBiblioteka.getLiczbaPlaylist());
    }

}