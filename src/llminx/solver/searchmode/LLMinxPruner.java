package llminx.solver.searchmode;

import llminx.LLMinx;

/**
 *
 */
public interface LLMinxPruner {

  String getName();

  boolean isPrecomputed(LLMinxMetric aMetric);

  byte[] loadTable(LLMinxMetric aMetric);

  void saveTable(byte[] aTable, LLMinxMetric aMetric);

  int getTableSize();

  int getCoordinate(LLMinx aMinx);

  void getMinx(int aCoordinate, LLMinx aMinx);

  boolean usesCornerPermutation();

  boolean usesEdgePermutation();

  boolean usesCornerOrientation();

  boolean usesEdgeOrientation();

}
