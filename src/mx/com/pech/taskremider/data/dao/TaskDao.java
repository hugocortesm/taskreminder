package mx.com.pech.taskremider.data.dao;

import java.util.List;

import mx.com.pech.taskremider.data.model.Priority;
import mx.com.pech.taskremider.data.model.Task;

public interface TaskDao {

	List<Task> loadAll();

	List<Task> loadByPriority(Priority priority);

	List<Task> loadAllOrderByEndDate();

}
