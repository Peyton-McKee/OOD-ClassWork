package org.example.models;
/**
 * Represents a cell on a board.
 */
public class BoardCell {
    private final Coord coord;

    /**
     * Create a cell for a board.
     *
     * @param coord Where the cell is located
     */
    public BoardCell(Coord coord) {
        this.coord = coord;
    }

    /**
     * Gets the cell's coordinates.
     *
     * @return the cell's coordinates
     */
    public Coord getCoords() {
        return this.coord;
    }
}
