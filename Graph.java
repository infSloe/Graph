import java.util.*;
/**
 * Graph.
 */

public class Graph
{
    //Attribute
    private Knoten[] knotenliste;
    private int maxAnzahl;
    private int anzahl;

    private boolean[][] adjazenzmatrix;

    //Konstruktor
    public Graph(int maxAnzahl)
    {
          this.maxAnzahl = maxAnzahl;
        anzahl = 0;
        knotenliste = new Knoten[maxAnzahl];
        adjazenzmatrix = new boolean[maxAnzahl][maxAnzahl];
    }

    //Methoden
    /**
     *  Falls die maximale Knotenanzahl noch nicht erreicht ist, 
     *  wird ein neuer Knoten mit dem übergebenen Inhalt erzeugt
     *  und in die knotenliste eingefügt. 
     *  anzahl wird dann um ein erhöht.
     *  
     *  @param inhalt Eine Zeichenkette, die im Knoten gespeichert werden soll.
     */
    public void  knotenEinfuegen(String inhalt)
    {

        // Hier gibt es etwas zu tun        
    }

    /**
     * Prüft ob der übergebene Inhalt in einem Knoten gespeichert ist und gibt dessen Nummer zurück.
     * Falls der Inhalt nicht gespeichert ist, soll -1 zurückgegeben werden.
     * 
     *   @param inhalt  Nach dieser Zeichenkette wird gesucht
     *   @return        Falls die Suche erfolgreich war, wird die Knotennr. zurückgegeben, ansonsten -1
     */
    public int knotennummerGeben(String inhalt)
    {
        // Hier gibt es etwas zu tun
        return 0;
    }         

    /**
     * Gibt eine Liste mit allen Knotennamen als String zurück
     */    
    public String alleKnoten()
    {
        String s = "";
        // Hier gibt es etwas zu tun
        return s;
    }

    /**
     * Fügt eine gerichtete Kante zwischen den Knoten mit den Inhalten bez1 und bez2 ein.
     * Falls es zu einem Bezeichner keinen Knoten geben sollte, wird eine Fehlermeldung
     * auf der Konsole ausgegeben.
     * 
     * @param bez1, bez2  Die Inhalte der beiden Knoten
     */
    public void kanteEinfuegen(String bez1, String bez2)
    {
       // Hier gibt es etwas zu tun
    }

    /**
     * Fügt eine ungerichtete Kante zwischen den Knoten mit den Inhalten bez1 und bez2 ein.
     */
    public void ungerichteteKanteEinfuegen(String bez1, String bez2)
    {
// Hier gibt es etwas zu tun
    }

    /**
     * Entfernt eine Kante zwischen zwei Knoten mit den Inhalten bez1 und bez2
     */
    public void kanteEntfernen(String bez1, String bez2)
    {
        // Hier gibt es etwas zu tun
    }
    
    /**
     * Überprüft, ob es zwischen den beiden Knoten mit den Bezeichnern bez1 und bez2 eine Kante gibt.
     */
    
    public boolean istKante(String bez1, String bez2)
    {
        // Hier gibt es etwas zu tun
        return true;
    }
  
    /**
     * Liefert die knotenliste zurück (Getter)
     */
    public Knoten[] getKnotenliste()
    {
        return knotenliste;
    }

    /**
     * Liefert die Adjazenzmatrix zurück
     */
    public boolean[][] getAdjazenzmatrix()
    {
        return adjazenzmatrix;
    }
    
    /**
     * Liefert die Knotenanzahl zurück
     */

    public int getKnotenAnzahl()
    {
        return anzahl;
    }

    /**
     *  Liefert den Knoten zu einem gegebenen Bezeichner zurück.
     */
    public Knoten getKnoten(String bez)
    {
        for (Knoten knoten: knotenliste)
        {
            if (knoten.getInhalt().equals(bez))
            {
                return knoten;
            }
        }
        return null;
    }
    
    /**
     * Algorithmus tiefensuche
     */
    public ArrayList<String> tiefenSuche(String a)
    {
        ArrayList<String> reihenfolge = new ArrayList<String>();
        int k1 = knotennummerGeben(a);
        // Alle Knoten als unbesucht markieren
        for (int i = 0; i < anzahl; i++)
        {
            knotenliste[i].setMarke(false);
        }
        
        
        //Aufruf der rekursiven Suchmethode
        tiefensucheKnoten(k1,reihenfolge);
        return reihenfolge;
        
    }
    
    
    public void tiefensucheKnoten(int start, ArrayList<String> reihenfolge)
    {
        //System.out.println("Knoten " + knotenliste[start].getInhalt());
        reihenfolge.add("+ " + knotenliste[start].getInhalt());
        knotenliste[start].setMarke(true);
        
        for (int i = 0; i < anzahl; i++)
        {
            if (adjazenzmatrix[start][i] && !knotenliste[i].getMarke())
            {
                tiefensucheKnoten(i,reihenfolge);
            }
        }
        reihenfolge.add("-" + knotenliste[start].getInhalt());
    }
        
    
    
}
