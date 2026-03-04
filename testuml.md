```mermaid
flowchart TD
    Start([Start]) --> Init[Initialisiere Liste]
    Init --> SetMax[max = Liste[0]]
    SetMax --> SetIdx[Index i = 1]
    
    SetIdx --> CheckLoop{i < Länge?}
    
    CheckLoop -- Ja --> Compare{Liste[i] > max?}
    Compare -- Ja --> UpdateMax[max = Liste[i]]
    Compare -- Nein --> Next[Erhöhe i]
    UpdateMax --> Next
    Next --> CheckLoop
    
    CheckLoop -- Nein --> Output[/Ausgabe max/]
    Output --> End([Ende])
```
flowchart TD
    Start([Start]) --> Init[Initialisiere Liste]
    Init --> SetMax[max = Liste[0]]
    SetMax --> SetIdx[Index i = 1]
    
    SetIdx --> CheckLoop{i < Länge?}
    
    CheckLoop -- Ja --> Compare{Liste[i] > max?}
    Compare -- Ja --> UpdateMax[max = Liste[i]]
    Compare -- Nein --> Next[Erhöhe i]
    UpdateMax --> Next
    Next --> CheckLoop
    
    CheckLoop -- Nein --> Output[/Ausgabe max/]
    Output --> End([Ende])
