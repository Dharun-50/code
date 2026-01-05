const addBtn = document.getElementById("addBtn");
const taskTitleInput = document.getElementById("taskTitle");
const taskDescriptionInput = document.getElementById("taskDescription");
const prioritySelect = document.getElementById("prioritySelect");
const taskList = document.getElementById("taskList");

const allBtn = document.getElementById("allBtn");
const lowBtn = document.getElementById("lowBtn");
const mediumBtn = document.getElementById("mediumBtn");
const highBtn = document.getElementById("highBtn");
let tasks = JSON.parse(localStorage.getItem("tasks")) || [];
function renderTasks(filter = "all") {
    taskList.innerHTML = "";

    let filteredTasks = tasks;

    if (filter === "low") {
        filteredTasks = tasks.filter(task => task.priority === "low");
    } else if (filter === "medium") {
        filteredTasks = tasks.filter(task => task.priority === "medium");
    } else if (filter === "high") {
        filteredTasks = tasks.filter(task => task.priority === "high");
    }

    filteredTasks.forEach((task, index) => {
        const li = document.createElement("li");
        li.classList.add(task.priority);
        li.innerHTML = `
            <div>
                <strong>${task.title}</strong>
                <p>${task.description}</p>
            </div>
            <button class="delete" onclick="deleteTask(${index})">Delete</button>
        `;
        taskList.appendChild(li);
    });
}
addBtn.addEventListener("click", () => {
    const title = taskTitleInput.value.trim();
    const description = taskDescriptionInput.value.trim();
    const priority = prioritySelect.value;

    if (title && description) {
        const newTask = { title, description, priority };
        tasks.push(newTask);
        localStorage.setItem("tasks", JSON.stringify(tasks)); // Save tasks to localStorage
        taskTitleInput.value = "";
        taskDescriptionInput.value = "";
        renderTasks();
    }
});
function deleteTask(index) {
    tasks.splice(index, 1);
    localStorage.setItem("tasks", JSON.stringify(tasks)); // Update localStorage
    renderTasks();
}
allBtn.addEventListener("click", () => renderTasks("all"));
lowBtn.addEventListener("click", () => renderTasks("low"));
mediumBtn.addEventListener("click", () => renderTasks("medium"));
highBtn.addEventListener("click", () => renderTasks("high"));
renderTasks();
