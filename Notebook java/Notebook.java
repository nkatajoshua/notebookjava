import java.util.ArrayList;

public class Notebook {
    ArrayList<String> notes = new ArrayList<>();

    public void addNote(String note) {
        notes.add(note);
        System.out.println("Note added successfully!");
    }

    public void viewNotes() {
        for (String note : notes) {
            System.out.println(note);
        }
    }

    public void deleteNote(int index) {
        notes.remove(index);
        System.out.println("Note deleted successfully!");
    }

    public static void main(String[] args) {
        Notebook myNotebook = new Notebook();
        myNotebook.addNote("Remember to buy milk.");
        myNotebook.addNote("Meeting with John at 2pm.");
        myNotebook.viewNotes();
        myNotebook.deleteNote(0);
        myNotebook.viewNotes();
    }
}
