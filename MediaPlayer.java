public interface MediaPlayer
{
    void play(String trackName);
    void pause();
    String getCurrentTrack();
}
class AudioPlayer implements MediaPlayer
{
    private String currentTrack;
    @Override
    public void play(String nazwaUtworu)
    {
        currentTrack = nazwaUtworu;
        System.out.println("Odtwarzanie audio" + nazwaUtworu);
    }
    @Override
    public void pause()
    {
        System.out.println("Audio nie gra" + currentTrack);
    }
    @Override
    public String getCurrentTrack()
    {
        return currentTrack;
    }
}

class VideoPlayer implements MediaPlayer
{
    private String currentTrack;
    @Override
    public void play(String nazwaUtworu)
    {
        currentTrack = nazwaUtworu;
        System.out.println("Odtwarzanie wideo" + nazwaUtworu);
    }
    @Override
    public void pause()
    {
        System.out.println("Zatrzymaj wideo " + currentTrack);
    }
    public String getCurrentTrack()
    {
        return currentTrack;
    }
}