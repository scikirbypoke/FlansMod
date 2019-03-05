package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;

/**
 * Class used for storing the properties of a gun
 */
public class FireableGun
{

	/**
	 * Spread of the bullets shot with this gun
	 */
	private Float spread;
	
	/**
	 * Speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	 */
	private Float bulletSpeed;
	
	/**
	 * The InfoType of this gun
	 */
	private InfoType type;
	
	/**
	 * the damage this gun will cause
	 */
	private Float damage;
	
	/**
	 * @param type        InfoType of the gun
	 * @param damage      Damage of the gun
	 * @param spread      Bullet spread of the gun
	 * @param bulletSpeed Bullet speed of the gun (0 means instant/raytraced)
	 */
	public FireableGun(InfoType type, Float damage, Float spread, Float bulletSpeed)
	{
		this.type = type;
		this.damage = damage;
		this.spread = spread;
		this.bulletSpeed = bulletSpeed;
	}
	
	/**
	 * @return the bullet spread of this gun
	 */
	public Float getGunSpread()
	{
		return spread;
	}
	
	/**
	 * @return the shortName of the InfoType of this gun
	 */
	public String getShortName()
	{
		return type.shortName;
	}
	
	/**
	 * @return the InfoType of this gun
	 */
	public InfoType getInfoType()
	{
		return type;
	}
	
	/**
	 * @return the damage this gun will cause
	 */
	public Float getDamage()
	{
		return damage;
	}
	
	/**
	 * @return the speed a bullet fired from this gun will travel at. (0 means instant/raytraced)
	 */
	public Float getBulletSpeed()
	{
		return this.bulletSpeed;
	}
	
}
