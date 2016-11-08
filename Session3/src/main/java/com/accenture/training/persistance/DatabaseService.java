package com.accenture.training.persistance;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.accenture.training.domain.Game;
import com.accenture.training.domain.TestEntity;


/**
 * This service does some JPA operations. The purpose of this entire test
 * is just to see whether the data source can be used so the actual operations
 * don't matter much.
 * 
 * @author Arjan Tijms
 *
 */
@Stateless
public class DatabaseService {

    @PersistenceContext
    private EntityManager entityManager;

    public void saveNewEntity() {
    	saveNewEntity("mytest");
    }
    public void saveNewEntity(String value){

        TestEntity testEntity = new TestEntity();
        testEntity.setValue(value);

        entityManager.persist(testEntity);
    }
    public void saveNewGame(Game game){
    	entityManager.persist(game);
    }

    public List<TestEntity> getAllEntities() {
        return entityManager.createQuery("SELECT _testEntity FROM TestEntity _testEntity", TestEntity.class)
            .getResultList();
    }

    public List<Game> getAllGames() {
        return entityManager.createQuery("SELECT _game FROM Game _game", Game.class).getResultList();
    }

}
