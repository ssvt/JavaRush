package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserService() {
        @Override
        public User deleteUser(long id) {
            return null;
        }

        @Override
        public User createOrUpdateUser(String name, long id, int level) {
            return null;
        }

        @Override
        public List<User> getUsersByName(String name) {
            return null;
        }

        @Override
        public List<User> getAllDeletedUsers() {
            return null;
        }

        @Override
        public List<User> getUsersBetweenLevels(int fromLevel, int toLevel) {
            List<User> result = new ArrayList<>();
            for (int i = fromLevel; i <= toLevel; i++) {
     //           result.addAll(userDao.getUsersByLevel(i));
            }

            return result;
        }

        @Override
        public List<User> filterOnlyActiveUsers(List<User> allUsers) {
            return null;
        }

        @Override
        public User getUsersById(long userId) {
            return null;
        }
    };

    @Override
    public ModelData getModelData() {return modelData;}

    @Override
    public void loadUsers() {
        modelData.getUsers();
        userService.getUsersBetweenLevels(1, 100);
    }
    private List<User> getAllUsers() { return null; }
}
