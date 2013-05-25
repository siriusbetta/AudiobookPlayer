create table playlist(playlistID int unsigned auto_increment primary key,
userID int,
audioID int,
timeOfModification timestamp default current_timestamp
) auto_increment = 1;