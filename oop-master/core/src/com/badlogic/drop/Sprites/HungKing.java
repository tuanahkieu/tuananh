package com.badlogic.drop.Sprites;

import com.badlogic.drop.Screens.FirstMap;
import com.badlogic.drop.Screens.PlayScreen;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

public class HungKing extends Hero{
	
	public HungKing(World world, PlayScreen screen) {
		super(world, screen, 2,2,10);
		bulletType = "Thunder";
	}

	
	public void prepareAnimation() {
		atlasAttack1 = new TextureAtlas("Hero/Hero2/packs/Attack1.pack");
		atlasAttack2 = new TextureAtlas("Hero/Hero2/packs/Attack1.pack");
		atlasAttack3 = new TextureAtlas("Hero/Hero2/packs/Attack1.pack");
		atlasStanding = new TextureAtlas("Hero/Hero2/packs/Idle.pack");
		atlasRunning = new TextureAtlas("Hero/Hero2/packs/Run.pack");
		atlasJumping = new TextureAtlas("Hero/Hero2/packs/Jump.pack");
		atlasHurting = new TextureAtlas("Hero/Hero2/packs/Hurt.pack");
		atlasDieing = new TextureAtlas("Hero/Hero2/packs/Die.pack");
		
		attack1 = new Animation<TextureRegion>(0.08f, atlasAttack1.getRegions());
		attack2 = new Animation<TextureRegion>(0.08f, atlasAttack2.getRegions());
		attack3 = new Animation<TextureRegion>(0.08f, atlasAttack3.getRegions());
		running = new Animation<TextureRegion>(0.1f, atlasRunning.getRegions());
		jumping = new Animation<TextureRegion>(0.1f, atlasJumping.getRegions());
		standing = new Animation<TextureRegion>(0.1f, atlasStanding.getRegions());
		hurt = new Animation<TextureRegion>(0.1f, atlasHurting.getRegions());
		die = new Animation<TextureRegion>(0.1f, atlasDieing.getRegions());
		setRegion(atlasStanding.getRegions().get(1));
		HeroHeight = getRegionHeight();
		HeroWidth = getRegionWidth();

	}
}
