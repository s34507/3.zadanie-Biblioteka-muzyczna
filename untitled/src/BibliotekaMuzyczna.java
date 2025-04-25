import java.util.ArrayList;

import java.util.ArrayList;

public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }

    public void dodajUtwor(String utwor) {
        if (utwor == null || utwor.isBlank()) {
            return;
        }
        if (utwory.contains(utwor)) {
            return;
        }
        utwory.add(utwor);
    }

    public void usunUtwor(String utwor) {
        if (utwor == null || utwor.isBlank()) {
            return;
        }
        utwory.remove(utwor);
        for (int i = 0; i < playlisty.size(); i++) {
            playlisty.get(i).usunUtwor(utwor);
        }
    }

    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece:");
        for (int i = 0; i < utwory.size(); i++) {
            System.out.println("- " + utwory.get(i));
        }
    }

    public void wyszukajUtwory(String fraza) {
        if (fraza == null || fraza.isBlank()) {
            return;
        }
        System.out.println("Wyniki wyszukiwania dla frazy: " + fraza);
        for (int i = 0; i < utwory.size(); i++) {
            if (utwory.get(i).contains(fraza)) {
                System.out.println("- " + utwory.get(i));
            }
        }
    }

    public void utworzPlayliste(String nazwaPlayListy) {
        if (nazwaPlayListy == null || nazwaPlayListy.isBlank()) {
            return;
        }
        if (znajdzPlayliste(nazwaPlayListy) != null) {
            return;
        }
        playlisty.add(new Playlista(nazwaPlayListy));
    }

    public Playlista znajdzPlayliste(String nazwaPlayListy) {
        for (int i = 0; i < playlisty.size(); i++) {
            if (playlisty.get(i).getNazwa().equalsIgnoreCase(nazwaPlayListy)) {
                return playlisty.get(i);
            }
        }
        return null;
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlayListy) {
        if (utwor == null || nazwaPlayListy == null) {
            return;
        }
        Playlista p = znajdzPlayliste(nazwaPlayListy);
        if (p != null && utwory.contains(utwor)) {
            p.dodajUtwor(utwor);
        }
    }

    public void wyswietlPlayliste(String nazwaPlayListy) {
        Playlista p = znajdzPlayliste(nazwaPlayListy);
        if (p != null) {
            p.wyswietlUtwory();
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (int i = 0; i < playlisty.size(); i++) {
            System.out.println("- " + playlisty.get(i).getNazwa());
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}