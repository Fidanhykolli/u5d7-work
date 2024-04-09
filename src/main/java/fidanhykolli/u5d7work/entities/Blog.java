package fidanhykolli.u5d7work.entities;




public class Blog {
    private int id;
    private String categoria;
    private String titolo;
    private String cover;
    private String contenuto;
    private int tempoLetturaMinuti;

    public Blog() {
    }

    public Blog(int id, String categoria, String titolo, String cover, String contenuto, int tempoLetturaMinuti) {
        this.id = id;
        this.categoria = categoria;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.tempoLetturaMinuti = tempoLetturaMinuti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getTempoLetturaMinuti() {
        return tempoLetturaMinuti;
    }

    public void setTempoLetturaMinuti(int tempoLetturaMinuti) {
        this.tempoLetturaMinuti = tempoLetturaMinuti;
    }
}
