@GetMapping("/")
public String home() {
    return """
    <h1>Welcome to Student Management by Ravi Shankar Shukla</h1>
    <button onclick="addStudents()">Add Students</button>
    <br><br>
    <a href="/students">View Students</a>

    <script>
        async function addStudents() {
            let count = prompt("How many students do you want to add?");

            for (let i = 1; i <= count; i++) {
                let name = prompt("Enter name of student " + i);
                let email = prompt("Enter email of student " + i);
                let course = prompt("Enter course of student " + i);

                await fetch('/students', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({
                        name: name,
                        email: email,
                        course: course
                    })
                });
            }

            alert("All students added successfully!");
            window.location.href = "/students";
        }
    </script>
    """;
}
