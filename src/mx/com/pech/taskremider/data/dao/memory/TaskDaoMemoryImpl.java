package mx.com.pech.taskremider.data.dao.memory;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import mx.com.pech.taskremider.data.dao.TaskDao;
import mx.com.pech.taskremider.data.model.Assignment;
import mx.com.pech.taskremider.data.model.Note;
import mx.com.pech.taskremider.data.model.Priority;
import mx.com.pech.taskremider.data.model.Status;
import mx.com.pech.taskremider.data.model.Task;

public class TaskDaoMemoryImpl implements TaskDao {

	private static List<Task> tasks = new ArrayList<Task>();

	@Override
	public List<Task> loadAll() {
		this.fillMockData();
		return tasks;
	}

	@Override
	public List<Task> loadByPriority(Priority priority) {
		this.fillMockData();
		return tasks;
	}

	@Override
	public List<Task> loadAllOrderByEndDate() {
		this.fillMockData();
		return tasks;
	}

	private void fillMockData() {
		Assignment a1 = new Assignment();
		a1.setId(1L);
		a1.setName("GM");
		a1.setDescription("Main Project");

		Assignment a2 = new Assignment();
		a1.setId(2L);
		a1.setName("Tecnocontrol");
		a1.setDescription("Some enhancements and maintenance");
		
		Task t1 = new Task();
		t1.setId(1L);
		t1.setAssignment(a1);
		t1.setName("Monitoring something");
		t1.setDescription("Detailed description");
		Calendar today = Calendar.getInstance();
		t1.setStartDate(today.getTime());
		today.add(Calendar.DATE, 2);
		t1.setEndDate(today.getTime());
		t1.setPriority(Priority.MEDIUM);
		t1.setStatus(Status.ON_TRACK);
		t1.setProgress(10);
		t1.setResponsible("Pech");
		Note n1 = new Note();
		n1.setId(1L);
		n1.setDescription("Mi first Note :D");
		t1.setNote(n1);
		
		Task t2 = new Task();
		t2.setId(2L);
		t2.setAssignment(a1);
		t2.setName("Task number two");
		t2.setDescription("Detailed description for task two");
		today = Calendar.getInstance();
		t2.setStartDate(today.getTime());
		today.add(Calendar.DATE, 6);
		t2.setEndDate(today.getTime());
		t2.setPriority(Priority.CRITICAL);
		t2.setStatus(Status.LATE);
		t2.setProgress(85);
		t2.setResponsible("Someone else");
		n1 = new Note();
		n1.setId(2L);
		n1.setDescription("note for task two");
		t2.setNote(n1);
		n1 = new Note();
		n1.setId(3L);
		n1.setDescription("note two for task two");
		t2.setNote(n1);
		
		Task t3 = new Task();
		t3.setId(3L);
		t3.setAssignment(a2);
		t3.setName("Task number three");
		t3.setDescription("Detailed description for task three");
		today = Calendar.getInstance();
		t3.setStartDate(today.getTime());
		today.add(Calendar.DATE, 4);
		t3.setEndDate(today.getTime());
		t3.setPriority(Priority.LOW);
		t3.setStatus(Status.WARNING);
		t3.setProgress(65);
		t3.setResponsible("Fulanito");
		n1 = new Note();
		n1.setId(4L);
		n1.setDescription("note for task three");
		t3.setNote(n1);
		n1 = new Note();
		n1.setId(5L);
		n1.setDescription("note two for task three");
		t3.setNote(n1);
		
		tasks.add(t1);
		tasks.add(t2);
		tasks.add(t3);
	}

}
