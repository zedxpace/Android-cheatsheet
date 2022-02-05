//Creating an object of media player
MediaPlayer player;

//create 3 buttons play ,pause ,stop and set their onclick to below functions play() ,pause() ,stop()
//play music
public void play(View view){
    player.start();
}

//paus music
public void pause(View view){
    player.pause();
}

//stop music
public void stop(View view){
    player.stop();
}

//binding mp3 in resource to the media player object
//replace music with the name of mp3 which you wanna embbed
player = MediaPlayer.create(this ,R.raw.music);

//control the volume of audio player with the seekbar
//seekbar - for volume
//replace vol with the id of your seek bar 
SeekBar volume = findViewById(R.id.vol);

volume.setMax(max_volume);
volume.setProgress(current_volume);

//get change listener to capture the volume
volume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
    @Override
    //audio is the object of Audio player of above metioned audio player 
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //it will set the systems sound acc to progress
        audio.setStreamVolume(AudioManager.STREAM_MUSIC ,progress ,0);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
});
