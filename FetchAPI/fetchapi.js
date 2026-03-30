fetch("https://jsonplaceholder.typicode.com/todos")
  .then(response => response.json())
  .then(data => {
    const completedTasks = data.filter(task => task.completed === true);
    
    completedTasks.forEach(task => {
      console.log(task);
    });
  })
  .catch(error => {
    console.log("Error:", error);
  });