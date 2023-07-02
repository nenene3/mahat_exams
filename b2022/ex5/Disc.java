package b2022.ex5;

public class Disc {

    private String diskName;
    private Song[] songs;

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs;
    }

    public Disc(String diskName, Song[] songs) {
        this.diskName = diskName;
        this.songs = songs;
    }
    public boolean exist(String nSong,String pSong){


        for(int i=0;i<this.songs.length;i++)
            if(this.songs[i].getName().equals(nSong) &&
                    this.songs[i].getPerformer().equals(pSong))
                return true;

        return false;

    }

}
