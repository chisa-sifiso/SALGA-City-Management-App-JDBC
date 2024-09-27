<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SALGA City Management App - README</title>
</head>
<body>

<h1>SALGA City Management App</h1>

<p>The <strong>SALGA City Management App</strong> is designed to manage cities and their respective mayors. It utilizes Java as the backend language, JDBC for database connectivity, and a Derby database to store city and mayor details.</p>

<h2>Features</h2>
<ul>
    <li>Add new cities and mayors to the database.</li>
    <li>Update mayor details.</li>
    <li>Manage city records through JDBC connections.</li>
</ul>

<h2>Technology Stack</h2>
<ul>
    <li>Java (JDK 8 or higher)</li>
    <li>JDBC</li>
    <li>Apache Derby Database</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<p>Before running the project, make sure you have the following installed:</p>
<ul>
    <li>Java Development Kit (JDK 8 or higher)</li>
    <li>Apache Derby Database</li>
</ul>

<h3>Setting Up the Database</h3>
<ol>
    <li>Install and start the Apache Derby Database.</li>
    <li>Create the necessary tables for <code>City</code> and <code>MayorTbl</code>.</li>
    <pre><code>CREATE TABLE City (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    populaton INT,
    mayor_id INT
);

CREATE TABLE MayorTbl (
    unique_id INT PRIMARY KEY,
    name VARCHAR(255),
    surname VARCHAR(255)
);</code></pre>
</ol>

<h2>How to Run</h2>
<ol>
    <li>Clone the repository: <code>git clone https://github.com/yourusername/SALGA-City-Management-App.git</code></li>
    <li>Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).</li>
    <li>Ensure the database connection details (URL, username, password) in the <code>SALGAM</code> class are correctly configured.</li>
    <li>Run the <code>SALGAAPP</code> class as the main entry point of the program.</li>
</ol>

<h2>Contributing</h2>
<p>Contributions are welcome! If you want to contribute, feel free to fork the repository and submit a pull request.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for more details.</p>

</body>
</html>
