

public class Pile {
	int[] elements;
    int indiceSommet;

	/**
	 * Constructeur qui crée une pile de i elements
	 * @param i IN : Taille maximale de la pile	
	 */
	public Pile(int i) {
		// TODO Auto-generated constructor stub
		this.elements = new int[i];
        this.indiceSommet = -1;
	}
	/**
	 * Vérifie si la pile est vide
	 * @return true si la pile est vide false sinon
	 */
	public boolean est_vide() {
		// TODO Auto-generated method stub
		if (this.indiceSommet ==-1)
        {
            return true;
        }
        return false;
	}
	/**
	 * Vérifie si la pile est pleine
	 * @return true si la pile est pleine false sinon
	 */
	public boolean est_plein() {
		// TODO Auto-generated method stub
		if (this.indiceSommet == this.elements.length)
        {
            return true;
        }
        return false;
	}
	/**
	 * Permet d'empiler un élément i dans une pile, ne marche pas si la pile est pleine

	 * @param i IN : Entier à empiler dans la pile
	 */
	public void empiler(int i){
		// TODO Auto-generated method stub
		if(this.est_plein())
        {
            //Erreur -> Mais programmation par contrat donc on renvoie rien
        }
        this.elements[this.indiceSommet+1] = i;
        this.indiceSommet+=1;
	}

	/**
	 * Permet de depiler une pile et renvoie l'élement depilé, marche pas si pile vide 
	 * @return Element depilé
	 */
	public int depiler() {
		// TODO Auto-generated method stub
		if(this.est_vide())
		{
			//Erreur -> Mais programmation par contrat donc on renvoie rien
		}
		this.indiceSommet-=1;
		int elem = this.elements[this.indiceSommet+1];
		this.elements[this.indiceSommet+1] =0;
		return elem;
	}
	
	/**
	 * Renvoie le sommet de la pile sans le depiler
	 * @return Sommet de la pile
	 */
	public int sommet()
	{
		return this.elements[this.indiceSommet];
	}
	/**
	 * Vide la pile
	 */
	public void vider()
	{
		this.indiceSommet =-1;
	}

}
