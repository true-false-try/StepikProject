INSERT INTO USERS (email, first_name, last_name, password, role)
    VALUES ('yevhenii@gmail.com', 'Yevhenii', 'Volovitskyi', 'qwerty1234'),
           ('alex@gmail.com', 'Alex', 'Rolman', 'qwerty12344321');

INSERT INTO USER_ROLE (role, user_id)
    VALUES ('role_admin', 1),
           ('role_user',2);
