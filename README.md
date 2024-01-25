<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

  <header>
    <h1>API de Cadastro de Pacientes e Médicos</h1>
    <img src="https://camo.githubusercontent.com/b0648ef7a9b6980ea27c1caaeb06d5c8503dbb4f9b4d9d7ca1df60a5edc14340/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f6a6176612d2532334544384230302e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d6f70656e6a646b266c6f676f436f6c6f723d7768697465"
         alt="Java Logo">
    <img src="https://camo.githubusercontent.com/c2a58428fe9b38967494da3b0a098f1d28f9cc395e3bbf123cbc14fb36bc1b07/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f737072696e672d2532333644423333462e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d737072696e67266c6f676f436f6c6f723d7768697465"
         alt="Spring Logo">
    <img src="https://camo.githubusercontent.com/bf590679058d9d1074a82721726ea4a5bf048b4b8cce82d01ba8ca32585e0298/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f706f7374677265732d2532333331363139322e7376673f7374796c653d666f722d7468652d6261646765266c6f676f3d706f737467726573716c266c6f676f436f6c6f723d7768697465"
         alt="PostgreSQL Logo">
    <img src="https://camo.githubusercontent.com/aac74ca85b21ed1ff4fa88dda8712fce9cddbf786bdf807231e6179f70003ac5/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4a57542d626c61636b3f7374796c653d666f722d7468652d6261646765266c6f676f3d4a534f4e253230776562253230746f6b656e73"
         alt="JWT Logo">
  </header>

  <section>
    <h2>Readme</h2>
    <p>This project is an API built using Java, Java Spring, Flyway Migrations, PostgresSQL as the database, and Spring Security and JWT for authentication control.</p>
    <p>The API was developed for my mother, who is an awesome psychoanalyst and needed an application to register her patients.</p>
  </section>

  <section>
    <h2>API Endpoints</h2>
      <p>
      <strong>POST /medicos:</strong> Registers a new doctor<br>
      <strong>GET /medicos:</strong> Lists doctors with pagination<br>
      <strong>GET /medicos/{id}:</strong> Lists detailed information of doctors by ID<br>
      <strong>DEL /medicos/{id}:</strong> Deletes doctors by ID<br>
      <strong>PUT /medicos:</strong> Allows updating data such as phone and name<br>
         <br>
      <strong>GET /pacientes:</strong> Lists patients with pagination<br>
      <strong>GET /pacientes/{id}:</strong> Lists detailed information of patients by ID<br>
      <strong>PUT /pacientes:</strong> Updates data such as name, phone, address, observation note, consultation type, age, and recurrence day<br>
      <strong>DEL /pacientes/{id}:</strong> Deletes patients by ID<br>
      <strong>POST /pacientes:</strong> Registers a new patient<br>
    </p>
  </section>

  <section>
    <h2>Database</h2>
    <p>The project utilizes PostgresSQL as the database. The necessary database migrations are managed using Flyway.<p/>
  </section>

</body>

</html>
