package mx.com.pech.taskremider.service;

import java.util.List;

import mx.com.pech.taskremider.data.model.Task;

public interface TaskService {

	List<Task> loadAll();

}
