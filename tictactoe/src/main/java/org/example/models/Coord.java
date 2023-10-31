package org.example.models;

import java.util.Objects;

/**
 * Represents a row-column coordinate pair on a game board.
 */
public class Coord {
    private final int row;
    private final int col;

    /**
     * Creates a coordinate at the row and column.
     *
     * @param row row of the coordinate
     * @param col column of the coordinate
     */
    public Coord(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Gets the row of the coordinate.
     *
     * @return the row
     */
    public int getRow() {
        return this.row;
    }

    /**
     * Gets the column of the coordinate.
     *
     * @return the column
     */
    public int getCol() {
        return this.col;
    }

    /**
     * Determines if two coordinates represent the same coordinate.
     *
     * @param o the other coordinate
     * @return `true` if the coordinates refer to the same coordinate, `false` otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coord coord = (Coord) o;
        return row == coord.row && col == coord.col;
    }

    /**
     * Returns a hash code value for the coordinate.
     *
     * @return a hash code value for this coordinate
     */
    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }
}
