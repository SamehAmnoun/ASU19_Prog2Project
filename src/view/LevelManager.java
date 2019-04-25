package view;

import model.Enemies.Enemy;
import model.obstacles.Obstacle;

import java.util.ArrayList;

import static model.Enemies.EnemyType.TANK_SAND;

public class LevelManager {//todo temp static

    private static final float SPAWN_CD_ENEMY = 1000 * 10;
    private static final float SPAWN_CD_OBSTACLES = 1000 * 5f;

    private static ArrayList<Enemy> enemyArrayList = new ArrayList<>();

    private static long nextEnemySpawnTime;
    private static long nextObstaclesSpawnTime; //todo dup code

    private LevelManager() {
    }

    public static ArrayList<Enemy> getEnemyArrayList() {
        return enemyArrayList;
    }

    public static void createEnemies() {
        if (nextEnemySpawnTime < System.currentTimeMillis()) {
            nextEnemySpawnTime =  System.currentTimeMillis() + (long) (SPAWN_CD_ENEMY);

            Enemy enemy = new Enemy(TANK_SAND);
            enemyArrayList.add(enemy);
            GameViewManager.addGameObjectTOScene(enemy);
        }
    }

    public static void createObstacles() {//todo implement timer
        if (nextObstaclesSpawnTime < System.currentTimeMillis()) {
            nextObstaclesSpawnTime =  System.currentTimeMillis() + (long) (SPAWN_CD_OBSTACLES);

            GameViewManager.addGameObjectTOScene(new Obstacle());
        }
    }

    public static void removeEnemy(Enemy enemy) {
        enemyArrayList.remove(enemy);
    }
}
