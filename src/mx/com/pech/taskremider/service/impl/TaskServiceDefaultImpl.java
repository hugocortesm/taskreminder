package mx.com.pech.taskremider.service.impl;

import java.util.List;

import mx.com.pech.taskremider.data.dao.TaskDao;
import mx.com.pech.taskremider.data.dao.memory.TaskDaoMemoryImpl;
import mx.com.pech.taskremider.data.model.Task;
import mx.com.pech.taskremider.service.TaskService;

public class TaskServiceDefaultImpl implements TaskService {

	private TaskDao taskDao;

	@Override
	public List<Task> loadAll() {
		return getTaskDao().loadAll();
	}

	private TaskDao getTaskDao() {
		if (null == taskDao) {
			taskDao = new TaskDaoMemoryImpl();
		}
		return taskDao;
	}

}
