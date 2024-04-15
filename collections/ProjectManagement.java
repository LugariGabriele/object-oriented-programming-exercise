package collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class ProjectManagement {
    /**
     * Project represents a project. It encapsulates information such as the project name, start date, end date,
     * and a collection of tasks associated with the project. Projects can have multiple tasks assigned to them.
     */
    class Project {
        private String name;
        private LocalDate startDate;
        private LocalDate endDate;
        private final Set<Task>  tasks;

        public Project(String name, LocalDate startDate, LocalDate endDate) {
            this.name = name;
            this.startDate = startDate;
            this.endDate = endDate;
            this.tasks = new HashSet<>();

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getStartDate() {
            return startDate;
        }

        public void setStartDate(LocalDate startDate) {
            this.startDate = startDate;
        }

        public LocalDate getEndDate() {
            return endDate;
        }

        public void setEndDate(LocalDate endDate) {
            this.endDate = endDate;
        }
        public void addTask(Task task){
        tasks.add(task);
            if (task.getProject() != this) {
                task.setProject(this);
            }
        }
        public void removeTask(Task task) {
            tasks.remove(task);
            task.setProject(null);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Project project = (Project) o;
            return Objects.equals(name, project.name) && Objects.equals(startDate, project.startDate) && Objects.equals(endDate, project.endDate) && Objects.equals(tasks, project.tasks);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, startDate, endDate, tasks);
        }

        @Override
        public String toString() {
            return "Project{" +
                    "name='" + name + '\'' +
                    ", startDate=" + startDate +
                    ", endDate=" + endDate +
                    ", tasks=" + tasks +
                    '}';
        }
    }

    /**
     * Task represents a specific task within a project.It contains details such as a unique identifier, description,
     * estimated hours needed to complete the task, associated project, and team leader.
     */
    class Task {
        private final UUID uuid;
        private String description;
        private Integer hoursNeeded;
        private Project project;
        private Employee teamLeader;

        public Task( String description, Integer hoursNeeded) {
            this.uuid = UUID.randomUUID();
            this.description = description;
            this.hoursNeeded = hoursNeeded;
        }

        public UUID getUuid() {
            return uuid;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getHoursNeeded() {
            return hoursNeeded;
        }

        public void setHoursNeeded(Integer hoursNeeded) {
            this.hoursNeeded = hoursNeeded;
        }

        public Project getProject() {
            return project;
        }

        public void setProject(Project project) {
            this.project = project;
        }

        public Employee getTeamLeader() {
            return teamLeader;
        }

        public void setTeamLeader(Employee teamLeader) {
            this.teamLeader = teamLeader;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task = (Task) o;
            return Objects.equals(uuid, task.uuid) && Objects.equals(description, task.description) && Objects.equals(hoursNeeded, task.hoursNeeded) && Objects.equals(project, task.project) && Objects.equals(teamLeader, task.teamLeader);
        }

        @Override
        public int hashCode() {
            return Objects.hash(uuid, description, hoursNeeded, project, teamLeader);
        }

        @Override
        public String toString() {
            return "Task{" +
                    "uuid=" + uuid +
                    ", description='" + description + '\'' +
                    ", hoursNeeded=" + hoursNeeded +
                    ", project=" + project +
                    ", teamLeader=" + teamLeader +
                    '}';
        }
    }
    class Employee{
        private String name;
        private String lastname;
        private String socialSecurityCode;

        public Employee(String name, String lastname, String socialSecurityCode) {
            this.name = name;
            this.lastname = lastname;
            this.socialSecurityCode = socialSecurityCode;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getSocialSecurityCode() {
            return socialSecurityCode;
        }

        public void setSocialSecurityCode(String socialSecurityCode) {
            this.socialSecurityCode = socialSecurityCode;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(name, employee.name) && Objects.equals(lastname, employee.lastname) && Objects.equals(socialSecurityCode, employee.socialSecurityCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, socialSecurityCode);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", socialSecurityCode='" + socialSecurityCode + '\'' +
                    '}';
        }
    }
}
