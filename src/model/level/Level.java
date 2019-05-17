package model.level;

import controller.map.MapLoader;
import model.enemies.Enemy;

public class Level {
    private Enemy[][] enemies;
    private int timeBetweenWaves;
    private MapLoader mapLoader;
    private int timeBetweenSpawns;
    private int numberOfTornados;
    private int timeBetweenTornado;
    private int numberOfPowerups;
    private int timeBetweenPowerups;

    public Level(Enemy[][] enemies, int timeBetweenWaves, MapLoader mapLoader, int timeBetweenSpawns, int numberOfTornados, int timeBetweenTornado, int numberOfPowerups, int timeBetweenPowerups) {
        this.enemies = enemies;
        this.timeBetweenWaves = timeBetweenWaves;
        this.mapLoader = mapLoader;
        this.timeBetweenSpawns = timeBetweenSpawns;
        this.numberOfTornados = numberOfTornados;
        this.timeBetweenTornado = timeBetweenTornado;
        this.numberOfPowerups = numberOfPowerups;
        this.timeBetweenPowerups = timeBetweenPowerups;
    }

    public Enemy[][] getEnemies() {
        return enemies;
    }

    public int getTimeBetweenWaves() {
        return timeBetweenWaves;
    }

    public MapLoader getMapLoader() {
        return mapLoader;
    }

    public int getTimeBetweenSpawns() {
        return timeBetweenSpawns;
    }

    public int getNumberOfTornados() {
        return numberOfTornados;
    }

    public int getTimeBetweenTornado() {
        return timeBetweenTornado;
    }

    public int getNumberOfPowerups() {
        return numberOfPowerups;
    }

    public int getTimeBetweenPowerups() {
        return timeBetweenPowerups;
    }
}
