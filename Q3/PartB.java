public ArrayList<Match> buildMatches(){
        ArrayList<Match>end = new ArrayList<Match>();
        int i=0;
        if(competitorList.size() % 2 !=0){
            i=1;
        }
        for(int y=0;y<competitorList.size()/2;y++){
            Competiter first=competitorList.get(i+1);
            Competiter second= competitorList.get((competitorList.size()-1)-i);
            end.add(new Match(first,second));
        }
        return end;
    }
