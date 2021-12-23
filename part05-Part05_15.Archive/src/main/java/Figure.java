public class Figure {
    private String id;
    private String name;
    
    public Figure(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Figure)) {
            return false;
        }
        Figure comparedFigure = (Figure) compared;
        if (this.id.equals(comparedFigure.id)) {
            return true;
        }
        
        return false;
    }
    
    public String toString() {
        return this.id + ": " + this.name;
    }
}
